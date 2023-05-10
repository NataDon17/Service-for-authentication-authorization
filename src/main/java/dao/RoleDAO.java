package dao;

import pojo.Role;

public interface RoleDAO {
    void createRole(Role role);

    Role getRoleById(int id);

}
