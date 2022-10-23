package com.warehouseinhand.mytodolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.warehouseinhand.todolistdomain.ToDoList
import com.warehouseinhand.todolistdomain.ToDoWork
import java.util.*

class ToDoListViewModel(private var toDoList: ToDoList) : ViewModel() {
    private val _workList = MutableLiveData(listOf<ToDoWork>())
    val workList: LiveData<List<ToDoWork>>
        get() = _workList

    fun addToDoWork(description: String) {
        val newWork = ToDoWork(description = description, date = Date())
        toDoList += newWork
        _workList.value = toDoList.getWorkList()
    }
}