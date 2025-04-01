package models

import models.enums.TaskStatus

abstract class TaskModel(
    val id: Int,
    val title: String,
    var status: TaskStatus = TaskStatus.PENDING
)