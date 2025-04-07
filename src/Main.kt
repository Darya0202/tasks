import manager.TaskManagerImpl
import models.DelegatedTask
import models.PriorityTask
import models.SimpleTask
import models.enums.TaskPriority
import java.time.LocalDate

fun main() {
    val manager = TaskManagerImpl()

    val simpleTask = SimpleTask(1, "Помыть посуду")

    val delegatedTask = DelegatedTask(2, "Убраться в квартире")
    delegatedTask.addSubTask(SimpleTask(1,"Убраться в ванной"))
    delegatedTask.addSubTask(SimpleTask(2,"Убраться на кухне"))

    val priorityTask = PriorityTask(3,"Вынести мусор", TaskPriority.HIGH, LocalDate.now())

    manager.addTask(simpleTask)
    manager.addTask(delegatedTask)
    manager.addTask(priorityTask)

    manager.getAllTasks()

    manager.deleteTask(simpleTask)
    manager.getAllTasks()

    manager.changeStatus(delegatedTask)
    manager.getAllTasks()

}