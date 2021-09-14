/**
package com.bbva.pzic.products.proposals.facade.mapper.impl;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.bbva.pzic.products.proposals.facade.ISrvProposalsV0Processtasks;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import com.bbva.pzic.products.proposals.facade.mapper.IListProcessTaskProposalsMapper;
import com.bbva.pzic.routine.processing.data.DataProcessingExecutor;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v0")
@Produces(MediaType.APPLICATION_JSON)
@SN(registryID = "SNPE1700055", logicalID = "proposals")
@VN(vnn = "v0")
@Service
public class ProposalsV0Processtasks implements ISrvProposalsV0Processtasks {

    private static final Log LOG = LogFactory.getLog(ProposalsV0Processtasks.class);

    @Autowired
    private IListProcessTaskProposalsMapper listProcessTaskProposalsMapper;

    @Autowired
    private ISrvProposalsV0Processtasks srvProposalsV0Processtasks;

    @Autowired
    private DataProcessingExecutor inputDataProcessingExecutor;

    @Autowired
    private DataProcessingExecutor outputDataProcessingExecutor;




    @Override
    public ServiceResponse<ProcessTasks> lisProcessTasksProposals(String businessProcessId, String taskId) {
        return null;
    }
}
**/