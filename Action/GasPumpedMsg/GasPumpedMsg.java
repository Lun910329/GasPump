package Action.GasPumpedMsg;

import Data.Data;

public abstract class GasPumpedMsg {
    Data data;
    public GasPumpedMsg(Data data) {
        this.data = data;
    }

    public abstract void gasPumpedMsg();
}
