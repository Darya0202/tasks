package manager

import models.TaskModel

interface TaskManager {
    fun getAllTasks()

    fun addTask(taskModel: TaskModel)

    fun changeStatus(taskModel: TaskModel)

    fun deleteTask(taskModel: TaskModel)
}