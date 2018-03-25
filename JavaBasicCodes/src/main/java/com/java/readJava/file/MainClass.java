package com.java.readJava.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) throws IOException {
		//readClientFile();


		//File file = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/access_log.2017-01-03.log");

		// Count Apis total hits
		//sprocessTotalApisHitsCount(file);
		
		//String clientId = "";
		//Count Apis total hits client based

		//Set<RuleObject> rules = processTotalApisHitsCountClientSpecific(file);
		
		/*for(RuleObject ruleObject: rules) {
			System.out.println(ruleObject.getActualName()+" "+ruleObject.getCount());
		}*/

		
		// Count total apis hits by a spicific client
		//processSpecificClientBasedApisHitsCount(file);
		
		
		
		
		//File bigFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/test.log");
		
		//Set<RuleObject> setRuleObject = processActualFile(bigFile);
		
		/*for(RuleObject ruleObject: setRuleObject) {
			System.out.println(ruleObject.getActualName()+" "+ruleObject.getCount());
		}*/
		
		//File ruleFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/rulesfinal.csv");

		//
		
		File actualFile = new File(args[0]);
		//Set<ClientObject> setOfClient = readClientFile(clientFile);
		
		 Set<ClientWithIdPlatformMerchant> setOfClientWithIdPlatformMerchant = getClientTotalHits(args[1], actualFile);
		 for (ClientWithIdPlatformMerchant setObject : setOfClientWithIdPlatformMerchant) {
				System.out.println(setObject.getClientMerchant()+" "+setObject.getClientId()+" "+setObject.getClientPlatForm() + " "+setObject.getCount());;
				//break;
		}
		//Map<String,Long> mapOfClient = new HashMap<String,Long>(); */
		//setOfClient = processActualFileBasedOnClients(bigFile,setOfClient);
		
		/*
		File bigFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/access_log.2016-11-12.log");
		List<Integer> list = processActualFileBasedOnIOSClientSignInApi(bigFile);*/
		
		//printClient(setOfClient);
		
		
	/*	Set<RuleObject> finalCountApis = processActualFile(bigFile , setOfRules);*/
		
		//System.out.println(setOfRules.size());
		//String signinApi = "CLIENT_SIGN_IN";
		//String str = null;
		/*Set<RuleObject> setRuleObject =null;
		for (ClientObject setObject : setOfClient) {
				setRuleObject= setObject.getApiSets();
				System.out.println(setObject.getClientId());
				break;
		}

		System.out.println(getSignInApiCount(setOfClient));
		
		
		Map<String,Long> map = new HashMap<String,Long>();
		for(RuleObject ruleObject:setRuleObject) {
			System.out.println(ruleObject.getActualName());
			map.put(ruleObject.getActualName(), (long) 0);
		}
		
		
		
		//String fileName1="/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ClientBasedApiCall/ClientTotalCall.txt";
		//PrintWriter writer1 = new PrintWriter(fileName1, "UTF-8");
		for (ClientObject setObject : setOfClient) {
			String fileName="/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ClientBasedApiCall/"+setObject.getClientId()+".txt";
			PrintWriter writer = new PrintWriter(fileName, "UTF-8");
			writer.print(setObject.getClientId());
			long tmp =0;
			setObject.setTotalCount(0);
			for(RuleObject ruleObject:setObject.getApiSets()) {
				String str1="\n"+ruleObject.getActualName() + " " +ruleObject.getCount()+" "+ruleObject.getMainRule();
				tmp=tmp+ruleObject.getCount();
				long tmplong =map.get(ruleObject.getActualName());
				tmplong = tmplong+ruleObject.getCount();
				map.remove(ruleObject.getActualName());
				map.put(ruleObject.getActualName(), tmplong);
				writer.print(str1);
			}	
			setObject.setTotalCount(tmp);
			writer.close();*/
			//writer1.print(setObject.getClientId()+","+tmp+"\n");
			
		//}
		//writer1.close();
	/*	
		String fileName2="/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ClientBasedApiCall/ApisTotalCall.txt";
		PrintWriter writer2 = new PrintWriter(fileName2, "UTF-8");
		
		 Iterator it = map.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		      //  System.out.println(pair.getKey() + " = " + pair.getValue());
		        writer2.print(pair.getKey()+","+pair.getValue()+"\n");
		        it.remove(); // avoids a ConcurrentModificationException
		    }
		    writer2.close();*/

	}
	private static Set<ClientWithIdPlatformMerchant> getClientTotalHits(String filename, 
			File file) throws IOException {
		Set<ClientWithIdPlatformMerchant> clientWithIdPlatformMerchants = readClientFile(filename);
		
		FileInputStream fis = new FileInputStream(file);
	      long cnt=0;
	      long compare=0;
			// Construct BufferedReader from InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String line = null;
			try {
				while ((line = br.readLine()) != null) {
					for(ClientWithIdPlatformMerchant clientObject:clientWithIdPlatformMerchants) {
						//System.out.println(clientObject.getClientId());
						if(line.contains(clientObject.getClientId().trim())) {
							clientObject.setCount(clientObject.getCount()+1);
							break;
						}
					}
					if(cnt==compare) {
						System.out.println("processing at: "+cnt);
						compare+=1000000;
					}
					cnt++;
					}
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Final line at: "+cnt);
		
		return clientWithIdPlatformMerchants;
	}
	private static Set<ClientWithIdPlatformMerchant> readClientFile(String filename) throws IOException {
		File clientFile = new File(filename);
		Set<ClientWithIdPlatformMerchant> list = new HashSet<ClientWithIdPlatformMerchant>();
		FileInputStream fis = new FileInputStream(clientFile);

		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				String[] str = line.split("  ");
				if(str.length>=3) {
					ClientWithIdPlatformMerchant clientWithIdPlatformMerchant = new ClientWithIdPlatformMerchant();
					clientWithIdPlatformMerchant.setClientId(str[0].trim());
					clientWithIdPlatformMerchant.setCount(0);
					clientWithIdPlatformMerchant.setClientMerchant(str[1].trim());
					clientWithIdPlatformMerchant.setClientPlatForm(str[2].trim());
					list.add(clientWithIdPlatformMerchant);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(list.size() + "\t\t\t" + line.length());
		}

		br.close();
		return list;
	}
	private static void processSpecificClientBasedApisHitsCount(File file) {
		
		
	}
	private static Set<RuleObject> processClientBasedTotalApisHitsCount(File file , String clientId) throws IOException {
		return processTotalApisHitsCount(file,clientId);
	}

	private static Set<RuleObject> processTotalApisHitsCount(File file, String clientId) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		Set<RuleObject> rules = readFile();
	    long cnt=0;
	    long compare=0;
		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				if(rules == null) {
						continue; }
				if(!line.contains(clientId)) {
					continue; }

				for (RuleObject ruleObject: rules) {
					if(ruleObject.getMainRule().size()==1) {
						if(line.contains(ruleObject.getMainRule().get(0))) {
							boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
							if(!bln) {
								ruleObject.setCount(ruleObject.getCount()+1);
								break;
							}
							}
						} else if(ruleObject.getMainRule().size()>1){
							if(line.contains(ruleObject.getMainRule().get(0)) && line.contains(ruleObject.getMainRule().get(1))) {
								boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
								if(!bln) {
									ruleObject.setCount(ruleObject.getCount()+1);
									break;
								}
							}
						}
					} 
					if(cnt==compare) {
						System.out.println("processing at: "+cnt);
						compare+=1000000;
					}
					cnt++;
					}
				System.out.println("Final line at: "+cnt);
				} catch (ArrayIndexOutOfBoundsException e) {
				
			}

			br.close();
			return rules;
		
	}
	
	private static Set<RuleObject> processTotalApisHitsCountClientSpecific(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		Set<RuleObject> rules = readFile();
	    long cnt=0;
	    long compare=0;
		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				if(rules == null) {
						continue; }
				if(!line.contains("8E755A453D5306EC") 
						&& !line.contains("A921EE12775A7956") 
						&& !line.contains("97A4C6AABDA5850F")
						&& !line.contains("B80287F2B8B29EE3") 
						&& !line.contains("8008412DCA9C153D")) {
					continue; }

				for (RuleObject ruleObject: rules) {
					if(ruleObject.getMainRule().size()==1) {
						if(line.contains(ruleObject.getMainRule().get(0))) {
							boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
							if(!bln) {
								ruleObject.setCount(ruleObject.getCount()+1);
								break;
							}
							}
						} else if(ruleObject.getMainRule().size()>1){
							if(line.contains(ruleObject.getMainRule().get(0)) && line.contains(ruleObject.getMainRule().get(1))) {
								boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
								if(!bln) {
									ruleObject.setCount(ruleObject.getCount()+1);
									break;
								}
							}
						}
					} 
					if(cnt==compare) {
						System.out.println("processing at: "+cnt);
						compare+=1000000;
					}
					cnt++;
					}
				System.out.println("Final line at: "+cnt);
				} catch (ArrayIndexOutOfBoundsException e) {
				
			}

			br.close();
			return rules;
		
	}
	private static long getSignInApiCount(Set<ClientObject> setOfClient) {
		long cnt =0;
		for (ClientObject setObject : setOfClient) {
			if(	setObject.getClientId().equals("97A4C6AABDA5850F") ||
					setObject.getClientId().equals("8E755A453D5306EC") ||
					setObject.getClientId().equals("A921EE12775A7956") ||
					setObject.getClientId().equals("B80287F2B8B29EE3") ||
					setObject.getClientId().equals("8008412DCA9C153D") ) {
				if(setObject.getApiSets() != null) {
					for(RuleObject rule : setObject.getApiSets()) {
						if(rule.getActualName().equals("CLIENT_SIGN_IN")) {
							cnt = cnt + rule.getCount();
						}
					}
				}
			}
	}
		return cnt;
	}
	private static List<Integer> processActualFileBasedOnIOSClientSignInApi(
			File file) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				if (line.contains("97A4C6AABDA5850F") ||
					line.contains("8E755A453D5306EC") ||
					line.contains("A921EE12775A7956") ||
					line.contains("B80287F2B8B29EE3") ||
					line.contains("8008412DCA9C153D")
						) {
					String[] lines = line.split(" ");
					list.add(Integer.getInteger(lines[17]));
				}
			}
			}  catch (ArrayIndexOutOfBoundsException e) {
			
		}
		br.close();
		return list;
	}
	
	private static List<Integer> countClientSignInApi(
			File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				if (line.contains("97A4C6AABDA5850F") ||
					line.contains("8E755A453D5306EC") ||
					line.contains("A921EE12775A7956") ||
					line.contains("B80287F2B8B29EE3") ||
					line.contains("8008412DCA9C153D")
						) {
					
				}
			}
			}  catch (ArrayIndexOutOfBoundsException e) {
			
		}
		br.close();
		return null;
	}
	
	
	private static Set<RuleObject> processActualFile(File file) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		Set<RuleObject> rules = readFile();
	    long cnt=0;
	    long compare=0;
		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				if(rules == null)
						continue;
					for (RuleObject ruleObject: rules) {
						if(ruleObject.getMainRule().size()==1) {
							if(line.contains(ruleObject.getMainRule().get(0))) {
								boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
								if(!bln) {
									ruleObject.setCount(ruleObject.getCount()+1);
									break;
								}
								}
							} else if(ruleObject.getMainRule().size()>1){
								if(line.contains(ruleObject.getMainRule().get(0)) && line.contains(ruleObject.getMainRule().get(1))) {
									boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
									if(!bln) {
										ruleObject.setCount(ruleObject.getCount()+1);
										break;
									}
								}
							}
						} 
					if(cnt==compare) {
						System.out.println("processing at: "+cnt);
						compare+=1000000;
					}
					cnt++;
					}
				System.out.println("Final line at: "+cnt);
				} catch (ArrayIndexOutOfBoundsException e) {
				
			}

			br.close();
			return rules;
	}
	
	

	private static Set<ClientObject> processActualFileBasedOnClients(
			File file, Set<ClientObject> setOfClient) throws IOException {
		FileInputStream fis = new FileInputStream(file);
      long cnt=0;
      long compare=0;
		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				Set<RuleObject> rules=null;
				for(ClientObject clientObject:setOfClient) {
					if(line.contains(clientObject.getClientId())) {
						rules=clientObject.getApiSets();
						break;
					}
				}
				if(rules == null)
					continue;
				for (RuleObject ruleObject: rules) {
					if(ruleObject.getMainRule().size()==1) {
						if(line.contains(ruleObject.getMainRule().get(0))) {
							boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
							if(!bln) {
								ruleObject.setCount(ruleObject.getCount()+1);
								break;
							}
							}
						} else if(ruleObject.getMainRule().size()>1){
							if(line.contains(ruleObject.getMainRule().get(0)) && line.contains(ruleObject.getMainRule().get(1))) {
								boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
								if(!bln) {
									ruleObject.setCount(ruleObject.getCount()+1);
									break;
								}
							}
						}
					} 
				if(cnt==compare) {
					System.out.println("processing at: "+cnt);
					compare+=1000000;
				}
				cnt++;
				}
			System.out.println("Final line at: "+cnt);
			} catch (ArrayIndexOutOfBoundsException e) {
			
		}

		br.close();
		return setOfClient;
	}

	public static void printClient(Set<ClientObject> setOfClient) {
		System.out.println(setOfClient.size());
		for(ClientObject clientObject: setOfClient) {
			System.out.println("ClientID: "+clientObject.getClientId());
			System.out.println("total calls: "+totalCountApiCall(clientObject.getApiSets()));
		}
	}
	
	private static long totalCountApiCall(Set<RuleObject> apiSets) {
		long cnt=0;
		for(RuleObject object:apiSets) {
			cnt= cnt+object.getCount();
		}
		return cnt;
	}

	private static Set<ClientObject> readClientFile(File clientFile) throws IOException {

		Set<ClientObject> list = new HashSet<ClientObject>();
		FileInputStream fis = new FileInputStream(clientFile);

		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				line.trim();
				ClientObject clientObject = new ClientObject();
				clientObject.setClientId(line);
				Set<RuleObject> setOfRules = readFile();
				clientObject.setApiSets(setOfRules);
				list.add(clientObject);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(list.size() + "\t\t\t" + line.length());
		}

		br.close();
		return list;
	}

	public static Set<RuleObject> processActualFile(File file, Set<RuleObject> rules) throws IOException {

		FileInputStream fis = new FileInputStream(file);

		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				for (RuleObject ruleObject: rules) {
					if(ruleObject.getMainRule().size()==1) {
						if(line.contains(ruleObject.getMainRule().get(0))) {
							boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
							if(!bln) {
								ruleObject.setCount(ruleObject.getCount()+1);
								break;
							}
							}
						} else if(ruleObject.getMainRule().size()>1){
							if(line.contains(ruleObject.getMainRule().get(0)) && line.contains(ruleObject.getMainRule().get(1))) {
								boolean bln = applyCrossRules(ruleObject.getCrossRule(),line);
								if(!bln) {
									ruleObject.setCount(ruleObject.getCount()+1);
									break;
								}
							}
						}
					} 
				}
			} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(rules.size() + "\t\t\t" + line.length());
		}

		br.close();
		return rules;
	}
	

	
	private static boolean applyCrossRules(List<String> crossRule, String line) {
		boolean bln =false;
		for(String str:crossRule) {
			if(line.contains(str)) 
				return true;
		}
		return bln;
	}

	public static Set<RuleObject> readFile() throws IOException {
		File file = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/rulesfinal.csv");

		Set<RuleObject> list = new HashSet<RuleObject>();
		FileInputStream fis = new FileInputStream(file);

		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		String[] eachLine;
		try {
			while ((line = br.readLine()) != null) {
				eachLine = line.split(",");
				RuleObject object = new RuleObject();
				object.setActualName(eachLine[0]);
				object.setCount(0);
				object = getRuleObject(object, eachLine[1]);
				list.add(object);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(list.size() + "\t\t\t" + line.length());
		}

		br.close();
		return list;
	}

	private static RuleObject getRuleObject(RuleObject object, String str) {
		String[] eachLine = str.split("NOT");
		List<String> mainRules = new ArrayList<>();
		List<String> crossRules = new ArrayList<>();
		if (eachLine.length > 1) {
			crossRules = processCrossRule(Arrays.copyOfRange(eachLine, 1, eachLine.length));
		}
		mainRules = processMainRule(eachLine[0]);
		
		object.setMainRule(mainRules);
		object.setCrossRule(crossRules);
		object.setCount(0);
		return object;
	}

	private static List<String> processCrossRule(String[] crossRuleArray) {
		List<String> crossRules = new ArrayList<>();
		if (crossRuleArray.length == 1) {
			crossRules.add(crossRuleArray[0].trim());
		} else if (crossRuleArray.length > 1){
			for (String str: crossRuleArray) {
				crossRules.add(str.trim());
			}
		}
		return crossRules;
	}

	private static List<String> processMainRule(String mainlist) {
		List<String> mainRules = new ArrayList<>();
		String [] crossMainArray = mainlist.split("AND");
		if (crossMainArray.length == 1) {
			mainRules.add(crossMainArray[0].trim());
		} else if (crossMainArray.length > 1){
			for (String str: crossMainArray) {
				mainRules.add(str.trim());
			}
		}
		return mainRules;
	}
}
