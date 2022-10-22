package com.warehouseinhand.todolistdomain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import java.util.*

internal class ToDoWorkTest:StringSpec({
    "TodoWork에 checked 값을 설정 하지 않을 시 기본 값은 false 이다."{
        val toDoWork = ToDoWork(description = "TEST", date = Date())
        toDoWork.checked.shouldBeFalse()
    }
})