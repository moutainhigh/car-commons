package com.mljr.excel.export;

import com.lyqc.base.enums.EnumValue;

/**
 * @description: Excel导出类型
 * @Date : 2018/6/3 上午10:47
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
public enum ExportEnum implements EnumValue{
	ZIP(1,"zip"),//zip文件类型
	XLS(2,"xls")//excel文件类型
	;
	ExportEnum(int index, String name) {
		this.index = index;
		this.name = name;
	}

	private int index;
	private String name;

	@Override
	public int getIndex() {
		return this.index;
	}

	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * 根据索引获取名称
	 * @param index 索引
	 * @return
	 */
	public static String getNameByIndex(int index){
		for(ExportEnum e : ExportEnum.values()){
			if(e.getIndex() == index){
				return e.getName();
			}
		}
		return null;
	}

	/**
	 * 根据索引获取枚举对象
	 * @param index 索引
	 * @return
	 */
	public static ExportEnum getByIndex(int index){
		for(ExportEnum e : ExportEnum.values()){
			if(e.getIndex() == index){
				return e;
			}
		}
		return null;
	}
}
