package models

class DelegatedTask(id: Int, title: String): TaskModel(id, title){
    private val subTasks = mutableListOf<SimpleTask>()

    fun addSubTask(task: SimpleTask){
        subTasks.add(task)
    }

    fun getSubTasks(): List<TaskModel> = subTasks
}