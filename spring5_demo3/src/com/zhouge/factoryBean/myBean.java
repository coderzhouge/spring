package com.zhouge.factoryBean;

import com.zhouge.bean.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * factoryBean  Course
 */
public class myBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("英语");
        course.setScore(98);
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
