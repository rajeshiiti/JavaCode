package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MergeInterval {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Interval>  list = new ArrayList<Interval>();
		for(int i=0;i<n;i++) {
			Interval interval = new Interval();
			interval.start = inp.nextInt();
			interval.end = inp.nextInt();
			list.add(interval);
		}
		ArrayList<Interval> list1 = merge(list);
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i).start+" "+list1.get(i).end);
		}
		inp.close();
		
	}
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		/*ArrayList<Interval> list2 = new ArrayList<Interval>();
		for(int i=0;i<intervals.size();i++) {
			list2.add(intervals.get(i));
		}
		Collections.sort(intervals,EndSortComparator);
		Collections.sort(list2,StartSortComparator);
		ArrayList<Interval> list = new ArrayList<Interval>();
		int n = intervals.size();
		if(n==1)
			return intervals;
		Interval interval = intervals.get(0);
		int j = 0;
		for(int i =1;i<n;) {
			if(interval.end>=list.get(j).start) {
				interval.start = Math.min(list2.get(j).start,interval.start);
				interval.end = Math.max(list2.get(j).end,interval.end);
				j++;
			} else {
				while(interval.start<intervals.get(i).end) {
					
				}
				list.add(interval);
				interval = list2.get(j);
			}
		}
		list.add(interval);*/
		
		ArrayList<Interval> list = new ArrayList<Interval>();
		Collections.sort(intervals,StartSortComparator);
		int n = intervals.size();
		if(n==1)
			return intervals;
		Interval interval = intervals.get(0);
		for(int i=1;i<n;i++) {
			if(interval.end>=intervals.get(i).start) {
				interval.end = Math.max(intervals.get(i).end,interval.end);
			} else {
				list.add(interval);
				interval = intervals.get(i);
			}
		}
		list.add(interval);
		return list;

    }
	public static Comparator<Interval> EndSortComparator = new Comparator<Interval>() {
		
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			if(o1.end>o2.end)
				return 1;
			return -1;
		}
	};
public static Comparator<Interval> StartSortComparator = new Comparator<Interval>() {
		
		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			if(o1.start>o2.start)
				return 1;
			return -1;
		}
	};

}
class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }
