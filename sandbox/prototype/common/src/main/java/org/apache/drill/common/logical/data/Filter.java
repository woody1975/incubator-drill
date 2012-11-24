package org.apache.drill.common.logical.data;

import org.apache.drill.common.expression.LogicalExpression;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("filter")
public class Filter extends LogicalOperatorBase{
	public int input;
	public LogicalExpression expr;
}