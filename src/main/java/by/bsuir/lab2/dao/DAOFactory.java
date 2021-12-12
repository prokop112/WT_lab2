package main.java.by.bsuir.lab2.dao;

import main.java.by.bsuir.lab2.dao.impl.ApplianceDAOImpl;

/**
 * A factory for creating ApplianceDAO.
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private DAOFactory() {}

    public static DAOFactory getInstance() {
        return instance;
    }

    public ApplianceDAO getApplianceDAO() {
        return new ApplianceDAOImpl();
    }
}
