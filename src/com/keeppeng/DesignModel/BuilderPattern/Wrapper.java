package com.keeppeng.DesignModel.BuilderPattern;

/**
 * 拓展打包方式--纸包装的打包方式
 * 
 * @author keeppeng
 * @date 2019年7月12日 上午10:52:53
 */
public class Wrapper implements Packing {

	@Override
	public String pack() {

		return "wrapper";
	}

}
