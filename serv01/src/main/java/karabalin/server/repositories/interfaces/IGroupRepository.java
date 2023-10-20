package karabalin.server.repositories.interfaces;

import karabalin.server.entities.Group;
import karabalin.server.exceptions.RepositoryException;

import java.util.List;

public interface IGroupRepository {

    long add(Group t) throws RepositoryException;

    Long update(Group t) throws RepositoryException;
    void deleteById(long id) throws RepositoryException;
    Group getById(long id) throws RepositoryException;

    List<Group> getAll() throws RepositoryException;
}
