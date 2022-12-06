package com.basic.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestExam {

	public static void main(String[] args) {

		List<CompetitiveExam> competitiveExam=new ArrayList<CompetitiveExam>();
		competitiveExam.add(new CompetitiveExam(101, "JEE", "Sanjiv Misra", 24,45000));
		competitiveExam.add(new CompetitiveExam(101, "CAT", "Pankaj", 12,40000));
		competitiveExam.add(new CompetitiveExam(101, "NEET", "Rajeev Ranjan", 15,60000));
		competitiveExam.add(new CompetitiveExam(101, "MAT", "Vivek kumar", 36,30000));
		competitiveExam.add(new CompetitiveExam(101, "NET", "Prakash Jha", 14,20000));
		competitiveExam.add(new CompetitiveExam(101, "JRE", "Ravi Misra", 25,55000));
		/*
		Collections.sort(competitiveExam, new Comparator < CompetitiveExam > () {
            @Override
            public int compare(CompetitiveExam o1, CompetitiveExam o2) {
                return (int)(o1.getTotal_fees()-(o2.getTotal_fees()));
            }
        }); */
		
		//(o1, o2) ->(int) (o1.getTotal_fees()-o2.getTotal_fees())
		
        // ascending order using lambda expression
        Collections.sort(competitiveExam, (o1, o2) ->(int) (o1.getTotal_fees()-o2.getTotal_fees()));
        System.out.println("Ascending order => " + competitiveExam);
        
        // ascending order using lambda expression
        Collections.sort(competitiveExam, (o1, o2) ->(int) (o2.getTotal_fees()-o1.getTotal_fees()));
        System.out.println("Dscending order => " + competitiveExam);
        
     // Duration form shortest to longest order using lambda expression
        Collections.sort(competitiveExam, (o1, o2) ->(int) (o1.getCourse_duration()-o2.getCourse_duration()));
        System.out.println("Duration form shortest to longest order => " + competitiveExam);

	}
}
