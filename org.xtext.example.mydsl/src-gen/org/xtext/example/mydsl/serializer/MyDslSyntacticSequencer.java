/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_rAttribute___ColonEqualsSignKeyword_2_0_ExpressionParserRuleCall_2_1__q;
	protected AbstractElementAlias match_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1;
	protected AbstractElementAlias match_rOperation_RTagParserRuleCall_0_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_rAttribute___ColonEqualsSignKeyword_2_0_ExpressionParserRuleCall_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRAttributeAccess().getColonEqualsSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getRAttributeAccess().getExpressionParserRuleCall_2_1()));
		match_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getROperationAccess().getDefKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getROperationAccess().getOverrideKeyword_1_1()));
		match_rOperation_RTagParserRuleCall_0_a = new TokenAlias(true, true, grammarAccess.getROperationAccess().getRTagParserRuleCall_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getExpressionRule())
			return getexpressionToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRTagRule())
			return getrTagToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * expression :
	 * 	nonLeftRecExpression recExpression?
	 * ;
	 */
	protected String getexpressionToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "not";
	}
	
	/**
	 * rTag : '@'ID
	 * ;
	 */
	protected String getrTagToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "@";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_rAttribute___ColonEqualsSignKeyword_2_0_ExpressionParserRuleCall_2_1__q.equals(syntax))
				emit_rAttribute___ColonEqualsSignKeyword_2_0_ExpressionParserRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1.equals(syntax))
				emit_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_rOperation_RTagParserRuleCall_0_a.equals(syntax))
				emit_rOperation_RTagParserRuleCall_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (':=' expression)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ';' (rule end)
	 */
	protected void emit_rAttribute___ColonEqualsSignKeyword_2_0_ExpressionParserRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'def' | 'override'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) rTag* (ambiguity) type=Qualified
	 */
	protected void emit_rOperation_DefKeyword_1_0_or_OverrideKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     rTag*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) ('def' | 'override') type=Qualified
	 */
	protected void emit_rOperation_RTagParserRuleCall_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
