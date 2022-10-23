package com.warehouseinhand.mytodolist

import com.warehouseinhand.todolistdomain.ToDoList
import io.kotest.core.spec.style.StringSpec
import io.kotest.core.test.TestCase
import io.kotest.matchers.shouldBe

class ToDoListViewModelTest : StringSpec() {
    lateinit var viewModel: ToDoListViewModel
    override fun beforeEach(testCase: TestCase) {
        viewModel = ToDoListViewModel(toDoList = ToDoList())
    }

    init {
        "Description 이 주어졌을 때 ToDoList 에 TodoWork 가 추가 된다."{
            viewModel.addToDoWork("TestWork")
            val actual = viewModel.workList.getOrAwaitValue()
            actual.first().description shouldBe "TestWork"
        }
    }
}