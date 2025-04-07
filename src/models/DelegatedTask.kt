package models

class DelegatedTask(
    override val id: Int,
    override val title: String
): TaskModel(id, title){
    private val subTasks = mutableListOf<SimpleTask>()

    fun addSubTask(task: SimpleTask){
        subTasks.add(task)
    }

    fun getSubTasks(): List<TaskModel> = subTasks
}