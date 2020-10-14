package com.huang.pojo;

import java.util.*;

/**
 * @author :huangao
 */
public class Student {

    private String name;
    private Girl girlfriend;
    private String[] books;
    private List<String> hobbys;
    private Map<String, String> scores;
    private Set<String> idols;
    private Properties infos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Girl getGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(Girl girlfriend) {
        this.girlfriend = girlfriend;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getScores() {
        return scores;
    }

    public void setScores(Map<String, String> scores) {
        this.scores = scores;
    }

    public Set<String> getIdols() {
        return idols;
    }

    public void setIdols(Set<String> idols) {
        this.idols = idols;
    }

    public Properties getInfos() {
        return infos;
    }

    public void setInfos(Properties infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", girlfriend=" + girlfriend +
                ", books=" + Arrays.toString(books) +
                ", hobbys=" + hobbys +
                ", scores=" + scores +
                ", idols=" + idols +
                ", infos=" + infos +
                '}';
    }
}
