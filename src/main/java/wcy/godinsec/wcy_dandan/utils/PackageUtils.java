package wcy.godinsec.wcy_dandan.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

import wcy.godinsec.wcy_dandan.application.WcyApplication;

/**
 * Auther：杨玉安 on 2018/4/4 20:32
 * E-meil：wcy0312808@163.com
 * WeChat：15110052956
 * QQ    ：837513007
 * Function：
 */
public class PackageUtils {
    private PackageManager mPackageManager;
    //默认组件
    private ComponentName componentNameDefault;
    private ComponentName componentName2;
    private ComponentName componentName3;

    /**
     * 设置第icon2图标生效
     */
    private void enableComponentName2() {
        disableComponent(componentNameDefault);
        disableComponent(componentName3);
        enableComponent(componentName2);
    }

    /**
     * 设置第icon3图标生效
     */
    private void enableComponentName3() {
        disableComponent(componentNameDefault);
        disableComponent(componentName2);
        enableComponent(componentName3);
    }

    /**
     * 启动组件
     *
     * @param componentName 组件名
     */
    private void enableComponent(ComponentName componentName) {
        //此方法用以启用和禁用组件，会覆盖Androidmanifest文件下定义的属性
        mPackageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }

    /**
     * 禁用组件
     *
     * @param componentName 组件名
     */
    private void disableComponent(ComponentName componentName) {
        mPackageManager.setComponentEnabledSetting(componentName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    //最后调用
    public void pmTest() {
//        //获取到包管理类实例
//        mPackageManager = getPackageManager();
//        //得到此activity的全限定名
//        componentNameDefault = getComponentName();
//        //根据全限定名创建一个组件，即activity-alias 节点下的name：HomeActivity2 对应的组件
//        componentName2 = new ComponentName(WcyApplication.getInstance(), "wcy.godinsec.wcy_dandan..views.activitys.AboutProjectActivity");
//        componentName3 = new ComponentName(WcyApplication.getInstance(), "com.yaojt.HomeActivity3");
//        String action = getActionFromServer();//从后台获取到应该使用那一个组件，或者根据时间来判断
//        if ("comp2".equals(action)){
//            enableComponentName2();
//        }else if ("comp3".equals(action)){
//            enableComponentName3();
//        }
//        //如果没有，则显示默认图标
    }
}
