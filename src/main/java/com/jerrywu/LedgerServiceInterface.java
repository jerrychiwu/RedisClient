package com.jerrywu;

import java.util.List;

public interface LedgerServiceInterface {
    List<String> getEntries(int count);
}
