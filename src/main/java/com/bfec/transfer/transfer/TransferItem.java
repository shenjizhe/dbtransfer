package com.bfec.transfer.transfer;

import com.bfec.common.enums.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferItem {
    List<TransferSource> sources;
    List<TransferDestination> destinations;
    OperationType type;
}
