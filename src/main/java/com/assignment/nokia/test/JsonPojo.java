package com.assignment.nokia.test;

import java.io.Serializable;
import java.util.Objects;

public class JsonPojo implements Serializable {

    String startTime;
    String node;
    String cpu;
    public JsonPojo() {
    }

    public JsonPojo(String startTime, String node, String cpu) {
        this.startTime = startTime;
        this.node = node;
        this.cpu = cpu;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonPojo jsonPojo = (JsonPojo) o;
        return Objects.equals(startTime, jsonPojo.startTime) && Objects.equals(node, jsonPojo.node) && Objects.equals(cpu, jsonPojo.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, node, cpu);
    }

    @Override
    public String toString() {
        return "JsonPojo{" +
                "startTime='" + startTime + '\'' +
                ", node='" + node + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}