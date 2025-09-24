package edu.ccrm.config;

import edu.ccrm.domain.*;
import java.util.*;

public final class DataStore {
    private static DataStore instance;
    private final Map<String, Student> students = new HashMap<>();
    private final Map<String, Course> courses = new HashMap<>();

    private DataStore(){ }

    public static synchronized DataStore getInstance(){
        if(instance == null) instance = new DataStore();
        return instance;
    }

    public Map<String, Student> getStudents(){ return students; }
    public Map<String, Course> getCourses(){ return courses; }
}
