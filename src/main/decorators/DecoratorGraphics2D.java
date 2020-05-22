package main.decorators;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;

import svg.element.BaseElement;
import svg.element.Element;
import svg.element.shape.Shape;
import svg.element.style.Style;

public class DecoratorGraphics2D extends Decorator
{
	final protected Graphics2D graphics2D;
	final protected Stroke defaultStroke;
	
	public DecoratorGraphics2D(final BaseElement base, final Style style, final Graphics2D g2d)
	{
		super(base, style);
		this.graphics2D = g2d;
		this.defaultStroke = graphics2D.getStroke();
	}

	@Override
	public Element newInstance()
	{
		return component.newInstance();
	}

	@Override
	public boolean load(String expr)
	{
		return component.load(expr);
	}

	@Override
	public void render()  //Graphics2D g2d)
	{
		if (((Shape)component).strokeWidth() != 0) {
			graphics2D.setStroke(new BasicStroke((float) component.strokeWidth()));	
		} else {
			graphics2D.setStroke(this.defaultStroke);
		}
		
		component.render();  //g2d);
	}

	@Override
	public void setBounds()
	{
		component.setBounds();
		
	}

}
