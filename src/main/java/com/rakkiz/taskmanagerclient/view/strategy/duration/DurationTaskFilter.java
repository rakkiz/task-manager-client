package com.rakkiz.taskmanagerclient.view.strategy.duration;

import com.rakkiz.taskmanagerclient.data.model.Task;
import com.rakkiz.taskmanagerclient.view.strategy.TaskFilter;

public class DurationTaskFilter implements TaskFilter {

    @Override
    public boolean filter(Task task){return true;}
}
