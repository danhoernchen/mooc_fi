/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author amigo
 */
public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        ArrayList<Double> sorted = new ArrayList<Double>(history);
        Collections.sort(sorted);
        return sorted.get(sorted.size() - 1);
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        ArrayList<Double> sorted = new ArrayList<Double>(history);
        Collections.sort(sorted);
        return sorted.get(0);
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double total = 0.0;
        for (double current : history) {
            total += current;
        }
        return total / history.size();
    }

    public double greatestFluctuation() {
        if (history.size() < 2) {
            return 0;
        }
        double greatestFluctuation = 0;
        List<Double> fluctuations = getFluctuations();
        for (double current : fluctuations) {
            if (current > greatestFluctuation) {
                greatestFluctuation = current;
            }
        }
        return greatestFluctuation;
    }

    public double variance() {
        if (history.size() < 2) {
            return 0;
        }
        double y = 0;
        for (double current : history) {
            double diff = current - average();
            diff *= diff;
            y += diff;
        }
        if(history.size() < 2){
            return y /history.size();
        } else {
            return y /(history.size() - 1);
        }
    }

    public ArrayList<Double> getFluctuations() {
        ArrayList<Double> fluctuations = new ArrayList<Double>();
        for (int i = 1; i < history.size(); i++) {
            fluctuations.add(Math.abs(history.get(i) - history.get(i - 1)));
        }
        return fluctuations;
    }

    public void reset() {
        this.history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
