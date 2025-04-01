package manager

import models.TaskModel

interface TaskManager {
    fun getAllTasks(taskModel: TaskModel)

    fun addTask(taskModel: TaskModel, onSuccess:() -> Unit)

    fun changeStatus(taskModel: TaskModel, onSuccess:() -> Unit)

    fun deleteTask(taskModel: TaskModel, onSuccess:() -> Unit)
}