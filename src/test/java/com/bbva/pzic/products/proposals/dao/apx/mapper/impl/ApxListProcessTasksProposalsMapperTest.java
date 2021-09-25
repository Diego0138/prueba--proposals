package com.bbva.pzic.products.proposals.dao.apx.mapper.impl;

import com.bbva.pzic.products.proposals.EntityMock;
import com.bbva.pzic.products.proposals.business.dto.InputListProcessTasksProposals;
import com.bbva.pzic.products.proposals.dao.apx.mapper.IApxListProcessTaskProposalsMappers;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.PeticionTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.dao.model.ppcutge1_1.RespuestaTransaccionPpcutge1_1;
import com.bbva.pzic.products.proposals.facade.dto.ProcessTasks;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

import static junit.framework.TestCase.*;


public class ApxListProcessTasksProposalsMapperTest {
    private IApxListProcessTaskProposalsMappers mappers;
    @Before
    public void setUp(){
        mappers = new ApxListProcessTaskProposalsMappers();
    }

  @Test
    public void mapInFullTest() throws IOException {
        InputListProcessTasksProposals input = EntityMock.getInstance().getInputListProcessTasksProposals();

        PeticionTransaccionPpcutge1_1 result = mappers.mapIn(input);

        assertNotNull(result);
        assertNotNull(result.getBusinessprocessid());
        assertNotNull(result.getTaskid());

        assertEquals(input.getBusinessProcessId(), result.getBusinessprocessid());
        assertEquals(input.getTaskId(), result.getTaskid());

    }

    @Test
    public void mapInEmptyTest(){
        PeticionTransaccionPpcutge1_1 result = mappers.mapIn(new InputListProcessTasksProposals());
        assertNotNull(result);
        assertNull(result.getBusinessprocessid());
        assertNull(result.getTaskid());

    }
    @Test
    public void mapOutFullTest() throws  IOException{
        RespuestaTransaccionPpcutge1_1 input = EntityMock.getInstance().getRespuestaTransaccionPpcutge1_1();

        ProcessTasks result = mappers.mapOut(input);
        assertNotNull(result);
        assertNotNull(result.getBusinessProcessId());
        assertNotNull(result.getTaskId());
        assertNotNull(result.getStatus());
        assertNotNull(result.getStatus().getId());
        assertNotNull(result.getStatus().getDescription());

        assertEquals(input.getCampo_1_businessprocessid(), result.getBusinessProcessId());
        assertEquals(input.getCampo_2_taskid(), result.getTaskId());
        assertEquals(input.getStatus().getId(), result.getStatus().getId());
        assertEquals(input.getStatus().getDescription(), result.getStatus().getDescription());

    }

    @Test
    public void mapOutEmptyTest(){
        ProcessTasks result = mappers.mapOut(null);
        assertNull(result);
    }
}