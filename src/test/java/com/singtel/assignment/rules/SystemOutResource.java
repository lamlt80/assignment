package com.singtel.assignment.rules;

import static org.mockito.Mockito.mock;

import java.io.PrintStream;

import org.junit.rules.ExternalResource;

public class SystemOutResource extends ExternalResource {
	
	private static PrintStream out;

	public static PrintStream getOut() {
		if (out == null) {
			out = mock(PrintStream.class);
		}
		return out;
	}

	@Override
	protected void before() throws Throwable {
		out = mock(PrintStream.class);
        System.setOut(out);
	}

	@Override
	protected void after() {
//		out.flush();
	}

}
