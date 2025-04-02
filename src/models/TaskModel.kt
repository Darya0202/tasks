package models

import models.enums.TaskStatus

abstract class TaskModel(
    open val id: Int,
    open val title: String,
    var status: TaskStatus = TaskStatus.PENDING
)