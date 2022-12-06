package com.basic.demo;

public class CompetitiveExam {
	int course_id;
	String course_name;
	String course_teacher;
	int course_duration;
	long total_fees;

	public CompetitiveExam(int course_id, String course_name, String course_teacher, int course_duration,
			long total_fees) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_teacher = course_teacher;
		this.course_duration = course_duration;
		this.total_fees = total_fees;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_teacher() {
		return course_teacher;
	}

	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}

	public int getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}

	public long getTotal_fees() {
		return total_fees;
	}

	public void setTotal_fees(long total_fees) {
		this.total_fees = total_fees;
	}

	@Override
	public String toString() {
		return "CompetitiveExam [course_id=" + course_id + ", course_name=" + course_name + ", course_teacher="
				+ course_teacher + ", course_duration=" + course_duration + ", total_fees=" + total_fees + "]";
	}
}
