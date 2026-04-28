package domain;

public class StockOperation extends MainDomain {
     public StockOperation() {
         this.id = -1;
     }
     public StockOperation(StockOperation stockOperation) {
        this.id = stockOperation.id;
     }
     public String operationOtrymanna;
     public String OperationOtrymanna() {
        return operationOtrymanna;
     }
     public String operationSpysanna;
     public String OperationSpysanna() {
        return operationSpysanna;
     }
     public String operationPeremi;
     public String operationPeremi() {
        return operationPeremi;
     }
}
