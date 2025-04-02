package models

data class SimpleTask(
    override val id: Int,
    override val title: String
): TaskModel(id, title)