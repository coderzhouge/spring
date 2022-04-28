package com.zhouge.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 基于xml方式注入集合类型(数组、List、map、set)属性
 */
public class Student {

    private String[] names ;
    private List<String> scores ;
    private Map<String,String> maps;
    private Set<String> sets ;
    private List<Course> courses ;



    public void setNames(String[] names) {
        this.names = names;
    }

    public void setScores(List<String> scores) {
        this.scores = scores;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    public void  test(){
        System.out.println(Arrays.toString(names));
        System.out.println(scores);
        System.out.println(maps);
        System.out.println(sets);
    }

    public void testCourse(){
        System.out.println(courses);
    }

    public void testScore(){
        System.out.println(scores);
    }

}
