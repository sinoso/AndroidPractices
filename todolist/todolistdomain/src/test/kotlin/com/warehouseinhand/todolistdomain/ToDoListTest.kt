package com.warehouseinhand.todolistdomain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.util.Date

class ToDoListTest : StringSpec({
    "빈 ToDoList 에 ToDoWork 를 추가하면 해당 ToDoWork 가 추가 된것을 확인 할 수 있다."{
        var toDoList = ToDoList()
        val date = Date()
        val toDoWork = ToDoWork(false, "TEST", date)
        toDoList += toDoWork
        val expected = listOf(toDoWork)
        toDoList.getWorkList() shouldBe expected
    }

    "빈 ToDoList 에 ToDoWork 목록을 추가하면 해당 ToDoWork들이 순서대로 추가 된것을 확인 할 수 있다."{
        var toDoList = ToDoList()
        val date = Date()
        val toDoWork = ToDoWork(false, "TEST", date)
        val toDoWork2 = ToDoWork(false, "TEST2", date)
        toDoList += listOf(toDoWork, toDoWork2)
        val actual = toDoList.getWorkList()
        actual[0] shouldBe toDoWork
        actual[1] shouldBe toDoWork2
    }
    "ToDoList의 특정 ToDoWork를 제거하면 ToDoWork 에서 제거 된 것을 확인 할 수 있다."{
        var toDoList = ToDoList()
        val date = Date()
        val toDoWork = ToDoWork(false, "TEST", date)
        val toDoWork2 = ToDoWork(false, "TEST2", date)
        toDoList += listOf(toDoWork, toDoWork2)
        toDoList -= toDoWork2
        val expected = listOf(toDoWork)
        toDoList.getWorkList() shouldBe expected
    }
})