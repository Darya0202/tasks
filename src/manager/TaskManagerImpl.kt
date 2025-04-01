package manager

import models.DelegatedTask
import models.PriorityTask
import models.SimpleTask
import models.TaskModel
import models.enums.TaskStatus

class TaskManagerImpl {
    private val tasks = mutableListOf<TaskModel>()

    fun getAllTasks(){
        println("Список задач:")
        for(task in tasks){
            when (task) {
                is DelegatedTask -> {
                    println("${task.id}. ${task.title} - ${task.status}")
                    task.getSubTasks().forEach{ println("   Подзадача ${it.id}. ${it.title}") }
                }

                is PriorityTask -> println("${task.id}. ${task.title} - ${task.status}, приоритет: ${task.priority}, дата: ${task.deadline}")

                is SimpleTask -> println("${task.id}. ${task.title} - ${task.status}")
            }

        }
    }

    fun addTask(taskModel: TaskModel){
        tasks.add(taskModel)
    }

    fun changeStatus(taskModel: TaskModel){
        when (taskModel.status) {

            TaskStatus.PENDING -> taskModel.status = TaskStatus.IN_PROGRESS

            TaskStatus.IN_PROGRESS -> taskModel.status = TaskStatus.DONE

            TaskStatus.DONE -> println("Задача выполнена. Невозможно изменить статус")

        }
    }

    fun deleteTask(taskModel: TaskModel){
        tasks.remove(taskModel)
    }


}