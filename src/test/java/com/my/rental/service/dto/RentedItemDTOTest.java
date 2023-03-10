package com.my.rental.service.dto;

import com.my.rental.web.rest.dto.RentedItemDTO;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.my.rental.web.rest.TestUtil;

public class RentedItemDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(RentedItemDTO.class);
        RentedItemDTO rentedItemDTO1 = new RentedItemDTO();
        rentedItemDTO1.setId(1L);
        RentedItemDTO rentedItemDTO2 = new RentedItemDTO();
        assertThat(rentedItemDTO1).isNotEqualTo(rentedItemDTO2);
        rentedItemDTO2.setId(rentedItemDTO1.getId());
        assertThat(rentedItemDTO1).isEqualTo(rentedItemDTO2);
        rentedItemDTO2.setId(2L);
        assertThat(rentedItemDTO1).isNotEqualTo(rentedItemDTO2);
        rentedItemDTO1.setId(null);
        assertThat(rentedItemDTO1).isNotEqualTo(rentedItemDTO2);
    }
}
