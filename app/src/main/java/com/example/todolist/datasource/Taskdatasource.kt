package com.example.todolist.datasource

import com.example.todolist.model.Task

object Taskdatasource{
    private val list = arrayListOf<Task>()

    fun getList() = list
    fun insertTask(task: Task) {
        list.add(task.copy(id= list.size +1))
    }

}