package com.example.librarycolor.colorpicker.builder;


import com.example.librarycolor.colorpicker.ColorPickerView;
import com.example.librarycolor.colorpicker.renderer.ColorWheelRenderer;
import com.example.librarycolor.colorpicker.renderer.FlowerColorWheelRenderer;
import com.example.librarycolor.colorpicker.renderer.SimpleColorWheelRenderer;

public class ColorWheelRendererBuilder {
	public static ColorWheelRenderer getRenderer(ColorPickerView.WHEEL_TYPE wheelType) {
		switch (wheelType) {
			case CIRCLE:
				return new SimpleColorWheelRenderer();
			case FLOWER:
				return new FlowerColorWheelRenderer();
		}
		throw new IllegalArgumentException("wrong WHEEL_TYPE");
	}
}