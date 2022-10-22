package com.warehouseinhand.todolistdomain

class ToDoList(private val workList: List<ToDoWork> = listOf()) {

    fun getWorkList(): List<ToDoWork> = workList.toList()

    operator fun plus(toDoWork: ToDoWork): ToDoList =
        ToDoList(workList + toDoWork)

    operator fun plus(listOfWork: List<ToDoWork>) =
        ToDoList(workList + listOfWork)

    operator fun minus(toDoWork: ToDoWork) = ToDoList(workList - toDoWork)


}