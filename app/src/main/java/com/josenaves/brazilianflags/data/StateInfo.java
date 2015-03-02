package com.josenaves.brazilianflags.data;

import com.google.gson.Gson;

import java.util.List;

public class StateInfo {

    private String name;
    private String capital;
    private Long area;
    private Long population;
    private List<String> mainCities;

    public StateInfo stateFromJson(String json) {
        Gson gson = new Gson();
        StateInfo state = gson.fromJson(json, StateInfo.class);
        return state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public List<String> getMainCities() {
        return mainCities;
    }

    public void setMainCities(List<String> mainCities) {
        this.mainCities = mainCities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StateInfo stateInfo = (StateInfo) o;

        if (area != null ? !area.equals(stateInfo.area) : stateInfo.area != null) return false;
        if (capital != null ? !capital.equals(stateInfo.capital) : stateInfo.capital != null)
            return false;
        if (mainCities != null ? !mainCities.equals(stateInfo.mainCities) : stateInfo.mainCities != null)
            return false;
        if (name != null ? !name.equals(stateInfo.name) : stateInfo.name != null) return false;
        if (population != null ? !population.equals(stateInfo.population) : stateInfo.population != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + (mainCities != null ? mainCities.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StateInfo{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", mainCities=" + mainCities +
                '}';
    }
}
