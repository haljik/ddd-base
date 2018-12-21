package example.application.service.contract;

import example.application.repository.ContractRepository;
import example.domain.model.contract.Contracts;
import example.domain.model.worker.WorkerNumber;
import example.domain.type.date.Date;
import org.springframework.stereotype.Service;

/**
 * 契約参照サービス
 */
@Service
public class ContractQueryService {
    ContractRepository contractRepository;

    /**
     *　雇用契約変遷
     */
    public Contracts getContracts(WorkerNumber workerNumber, Date startDate, Date endDate) {
        return contractRepository.getContracts(workerNumber, startDate, endDate);
    }

    ContractQueryService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

}
