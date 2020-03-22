package com.shuzijun.leetcode.plugin.actions.toolbar;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.shuzijun.leetcode.plugin.actions.AbstractAction;
import com.shuzijun.leetcode.plugin.model.Config;
import com.shuzijun.leetcode.plugin.utils.*;

/**
 * @author shuzijun
 */
public class LogoutAction extends AbstractAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent, Config config) {

        HttpRequest httpRequest = HttpRequest.get(URLUtils.getLeetcodeLogout());
        HttpResponse httpResponse = HttpRequestUtils.executeGet(httpRequest);
        HttpRequestUtils.resetHttpclient();
        MessageUtils.getInstance(anActionEvent.getProject()).showInfoMsg("info", PropertiesUtils.getInfo("login.out"));
    }
}
