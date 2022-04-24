package com.dragonsoft.designpattern.structure.composite.ibatis;

/**
 * 叶子节点
 * @author lingwh
 *
 */
public class TextSqlNode extends SqlNode {

	public TextSqlNode(String sqlStatement) {
		this.sqlStatement = sqlStatement;
	}
	
	@Override
	public void concatSqlStatement(DynamicContext context) {
		context.appendSql(sqlStatement);
	}

}