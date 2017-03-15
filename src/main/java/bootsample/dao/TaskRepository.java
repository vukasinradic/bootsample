package bootsample.dao;

import bootsample.model.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vukasin on 3/15/17.
 */
public interface TaskRepository extends CrudRepository<Task, Integer> {

}
