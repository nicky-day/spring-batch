package com.example.springbatch.domain.jobRepository;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.batch.BasicBatchConfigurer;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Configuration
//public class CustomBatchConfigurer extends BasicBatchConfigurer {
//
//    private final DataSource dataSource;
//
//    /**
//     * Create a new {@link BasicBatchConfigurer} instance.
//     *
//     * @param properties                    the batch properties
//     * @param dataSource                    the underlying data source
//     * @param transactionManagerCustomizers transaction manager customizers (or
//     *                                      {@code null})
//     */
//
//    protected CustomBatchConfigurer(BatchProperties properties, DataSource dataSource, TransactionManagerCustomizers transactionManagerCustomizers) {
//        super(properties, dataSource, transactionManagerCustomizers);
//        this.dataSource = dataSource;
//    }
//
//    @Override
//    protected JobRepository createJobRepository() throws Exception {
//
//        JobRepositoryFactoryBean jobRepositoryFactoryBean = new JobRepositoryFactoryBean();
//        jobRepositoryFactoryBean.setDataSource(dataSource);
//        jobRepositoryFactoryBean.setTransactionManager(getTransactionManager());
//        jobRepositoryFactoryBean.setIsolationLevelForCreate("ISOLATION_READ_COMMITTED");
//        jobRepositoryFactoryBean.setTablePrefix("SYSTEM_");
//
//        return jobRepositoryFactoryBean.getObject();
//    }
//}
