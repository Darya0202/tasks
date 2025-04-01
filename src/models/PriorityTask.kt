package models

import models.enums.TaskPriority
import java.time.LocalDate

class PriorityTask(
    id: Int,
    title: String,
    val priority: TaskPriority,
    val deadline: LocalDate
): TaskModel(id, title)