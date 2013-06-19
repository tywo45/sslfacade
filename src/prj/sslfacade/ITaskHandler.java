package prj.sslfacade;

import java.io.IOException;

public interface ITaskHandler
{
    /*
    In order to continue handshakes after tasks are processed the
    Handshaker.carryOn method must be called.
     */
    public void process(Tasks tasks) throws IOException;
}
