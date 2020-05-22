package main.decorators;
import java.awt.Graphics2D;
import main.decorators.shapes.DecoratorGraphics2DCircle;
import main.decorators.shapes.DecoratorGraphics2DEllipse;
import main.decorators.shapes.DecoratorGraphics2DLine;
import main.decorators.shapes.DecoratorGraphics2DPath;
import main.decorators.shapes.DecoratorGraphics2DPolygon;
import main.decorators.shapes.DecoratorGraphics2DPolyline;
import main.decorators.shapes.DecoratorGraphics2DRect;
import svg.element.shape.Circle;
import svg.element.shape.Rect;
import svg.element.shape.Line;
import svg.element.shape.Ellipse;
import svg.element.shape.Polyline;
import svg.element.shape.Polygon;
import svg.element.shape.path.Path;
import svg.element.shape.Shape;
import svg.element.Element;
public class DecoratorFactory{
    

    public DecoratorFactory(){
    }
    public Decorator getDecorator(Element element, Graphics2D g2dImage){
       		Decorator decorator = null;
            Shape shape = null;
       		switch(element.label()) {
       		case "circle":
       			shape = (Circle)element;
                decorator = new DecoratorGraphics2DCircle((Circle)shape,g2dImage);
                return decorator;	
       		case "ellipse":
       			shape = (Ellipse)element;
                decorator = new DecoratorGraphics2DEllipse((Ellipse)shape,g2dImage);
                return decorator;	   
       		case "line":
       			shape = (Line)element;
                decorator = new DecoratorGraphics2DLine((Line)shape,g2dImage);
                return decorator;	   
       		case "polygon":
       			shape = (Polygon)element;
                decorator = new DecoratorGraphics2DPolygon((Polygon)shape,g2dImage); 
                return decorator;	   
       		case "polyline":
       			shape = (Polyline)element;
                decorator = new DecoratorGraphics2DPolyline((Polyline)shape,g2dImage);
                return decorator;	   
       		case "rect":
       			shape = (Rect)element;
                decorator = new DecoratorGraphics2DRect((Rect)shape,g2dImage);
                return decorator;	
       		case "path":
       			shape = (Path)element;
                decorator = new DecoratorGraphics2DPath((Path)shape,g2dImage);
                return decorator;	
            }
       	System.out.println("Invalid file info");
        return decorator;	
    }
    
}