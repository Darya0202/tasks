package models

import models.enums.TaskPriority
import java.time.LocalDate

data class PriorityTask(
    override val id: Int,
    override val title: String,
    val priority: TaskPriority,
    val deadline: LocalDate
): TaskModel(id, title)