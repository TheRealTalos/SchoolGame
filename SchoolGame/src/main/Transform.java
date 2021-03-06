package main;

import org.joml.Matrix4f;
import org.joml.Vector3f;

public class Transform {
	public Vector3f pos;
	public Vector3f scale;
	
	public Transform(){
		pos = new Vector3f();
		scale = new Vector3f(1, 1, 1);
	}
	
	public Matrix4f getProjection(Matrix4f target){
		target.scale(scale);
		target.translate(pos);
		return target;
	}
	
	public void setScale(Vector3f scale){
		this.scale = scale;
	}
	
	public void setPos(Vector3f pos){
		this.pos = pos;
	}

}
